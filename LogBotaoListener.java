package br.cesed.si.map.observer.exemplo1;

public class LogBotaoListener implements EventosBotaoListener {

	@Override
	public void botaoOKClicado() {
		System.out.println("Registrando no Banco de Dados que o botao OK foi clicado");
	}

	@Override
	public void botaoSairClicado() {
		System.out.println("Registrando no Banco de Dados que o botao SAIR foi clicado");
	}

}
