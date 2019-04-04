package br.cesed.si.map.observer.exemplo1;

public class ExemploUso {

	public static void main(String[] args) {

		MeuBotao botao = new MeuBotao();
		
		botao.addEventosBotaoListener(new LogBotaoListener());
		botao.addEventosBotaoListener(new AutenticacaoBotaoListener());
		botao.addEventosBotaoListener(new EventosBotaoListener() {
			
			@Override
			public void botaoSairClicado() {
				System.out.println("Inner type");
			}
			
			@Override
			public void botaoOKClicado() {
				System.out.println("Inner type");
			}
		});
		
		botao.clicarBotaoOK();
		botao.clicarBotaoSair();
	}

}
