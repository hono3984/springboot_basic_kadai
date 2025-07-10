package com.example.springpractice.form;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProductRegisterForm {
	@NotBlank(message = "商品名を入力してください。")
	private String productName;
	
	@NotBlank(message = "価格は100円以上で入力してください。")
	@Min(value = 100)
	private String price;
	
	@NotBlank(message = "在庫数は１個以上で入力してください。")
	@Min(value = 1)
	private String stock;
}
