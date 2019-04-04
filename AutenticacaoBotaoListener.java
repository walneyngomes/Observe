package br.cesed.si.map.observer.exemplo1;

public class AutenticacaoBotaoListener implements EventosBotaoListener {

	@Override
	public void botaoOKClicado() {
		System.out.println("Verificando se o usuario e senha estao corretos");
	}

	@Override
	public void botaoSairClicado() {
		
	}

}
