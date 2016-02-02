package br.com.caelum.loja.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.caelum.loja.daos.ProdutoDao;
import br.com.caelum.loja.models.Produto;
import br.com.caelum.loja.models.TipoPreco;
import br.com.caelum.loja.validation.ProdutoValidation;

@Controller
@RequestMapping("produtos")
public class ProdutosController {

	@Autowired
	private ProdutoDao dao;
	
	@InitBinder
    public void InitBinder(WebDataBinder binder) {
        binder.addValidators(new ProdutoValidation());
    }
	
	@RequestMapping("form")
	public ModelAndView form() {
		
		ModelAndView modelAndView = new ModelAndView("produtos/form");
		modelAndView.addObject("tipos", TipoPreco.values());
		return modelAndView;
	}
	
	@RequestMapping(method=RequestMethod.POST)
    public ModelAndView grava(@Valid Produto produto, BindingResult result, RedirectAttributes attributes) {

        if(result.hasErrors()) {
            return form();
        }
        dao.gravar(produto);
        
        return new ModelAndView("produtos/ok");
    }

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("produtos/lista");
		List<Produto> produtos = dao.listar();
		modelAndView.addObject("produtos", produtos);

		return modelAndView;
	}
}
