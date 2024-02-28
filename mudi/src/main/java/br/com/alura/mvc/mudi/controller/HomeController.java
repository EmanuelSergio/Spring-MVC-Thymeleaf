package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Iphone 8");
		pedido.setUrlImagem("https://http2.mlstatic.com/D_NQ_NP_2X_819468-MLA43694219099_102020-F.webp");
		pedido.setUrlProduto("https://www.mercadolivre.com.br/iphone-8-64-gb-cinza-espacial/p/MLB8752432?item_id=MLB3524617833&from=gshop&matt_tool=47123466&matt_word=&matt_source=google&matt_campaign_id=14303413814&matt_ad_group_id=125984297277&matt_match_type=&matt_network=g&matt_device=c&matt_creative=539354956974&matt_keyword=&matt_ad_position=&matt_ad_type=pla&matt_merchant_id=735098639&matt_product_id=MLB8752432-product&matt_product_partition_id=2268628797008&matt_target_id=aud-1967156880386:pla-2268628797008&cq_src=google_ads&cq_cmp=14303413814&cq_net=g&cq_plt=gp&cq_med=pla&gad_source=1&gclid=CjwKCAiArfauBhApEiwAeoB7qKlTVAoSh4EZ91n430khUksr8cCrNVwkbqFuqvu2uUwX5dyWZ9S0nRoChiYQAvD_BwE");
		pedido.setDescricao("celular antigo podre, descrição antiga");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		
		
		model.addAttribute("pedidos", pedidos);
		return "home";
	}
	
}
