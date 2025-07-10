package com.example.springpractice.controller;

import org.springframework.validation.BindingResult;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.springpractice.form.ProductRegisterForm;

@PostMapping("/product")
public class ProductRegisterController {
	public String registerProduct(RedirectAttributes redirectAttributes,
	@Validated ProductRegisterForm form, BindingResult){
}
