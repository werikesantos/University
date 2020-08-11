package exercicioComplementarCondicionadorDeAr;

public class Teste {

	public static void main(String[] args) {
		
		//CRIANDO UM OBJETO COM O VALOR INICIAL DE (20) ESTABELECIDO NA CLASSE 'Termostato > temperatura (20)'
		//LIGANDO CONDICIONADOR DE AR
		CondicionadorDeAr condicionadorDeAr = new CondicionadorDeAr();
		
		condicionadorDeAr.ligar();
		
		//OBJETO CRIADO!
		Termostato termostato = new Termostato();
			
		//OBJETO CRIADO COM O VALOR DE (20), BASTA PASSAR O OBJETO PARA O MÉTODO 'condicionadorDeAr.aumentarTemperatura' ONDE A VARIÁVEL SERÁ MANIPULADA/PROCESSADA.
		
		condicionadorDeAr.aumentarTemperatura(termostato);
		
		//APÓS A MANIPULAÇÃO DA VARIÁVEL, BASTA PEGAR O NOVO VALOR ATRIBUÍDO A VARIÁVEL 'Termostato > temperatura (20)'
		termostato.getTemperatura();	
		
		//PEGANDO O NOVO VALOR ATRIBUÍDO NA CLASSE Termostato > temperatura (21) E MANDANDO PARA SER TRATADO NA CLASSE 'condicionadorDeAr'
		condicionadorDeAr.aumentarTemperatura(termostato);
		//APÓS A MANIPULAÇÃO DA VARIÁVEL, BASTA PEGAR O NOVO VALOR ATRIBUÍDO A VARIÁVEL 'Termostato > temperatura (21)'
		termostato.getTemperatura();	
		
		condicionadorDeAr.aumentarTemperatura(termostato);
		termostato.getTemperatura();	
		
		condicionadorDeAr.aumentarTemperatura(termostato);
		termostato.getTemperatura();
		
		condicionadorDeAr.aumentarTemperatura(termostato);
		termostato.getTemperatura();
		
		condicionadorDeAr.aumentarTemperatura(termostato);
		termostato.getTemperatura();
		
		condicionadorDeAr.aumentarTemperatura(termostato);
		termostato.getTemperatura();
		
		condicionadorDeAr.aumentarTemperatura(termostato);
		termostato.getTemperatura();
		
		//condicionadorDeAr.aumentarTemperatura(termostato);
		//termostato.getTemperatura();
		
		//condicionadorDeAr.aumentarTemperatura(termostato);
		//termostato.getTemperatura();
		
		//REDUZINDO TEMPERATURA	- FUNCIONANDO!!!!!
		condicionadorDeAr.reduzirTemperatura(termostato);
		termostato.getTemperatura();
		
		condicionadorDeAr.reduzirTemperatura(termostato);
		termostato.getTemperatura();
		
		condicionadorDeAr.reduzirTemperatura(termostato);
		termostato.getTemperatura();
		
		condicionadorDeAr.reduzirTemperatura(termostato);
		termostato.getTemperatura();
		
		condicionadorDeAr.reduzirTemperatura(termostato);
		termostato.getTemperatura();
		
		condicionadorDeAr.reduzirTemperatura(termostato);
		termostato.getTemperatura();
		
		condicionadorDeAr.reduzirTemperatura(termostato);
		termostato.getTemperatura();
		
		condicionadorDeAr.reduzirTemperatura(termostato);
		termostato.getTemperatura();
		
		condicionadorDeAr.reduzirTemperatura(termostato);
		termostato.getTemperatura();
		
		condicionadorDeAr.reduzirTemperatura(termostato);
		termostato.getTemperatura();
		
		condicionadorDeAr.reduzirTemperatura(termostato);
		termostato.getTemperatura();
		
		condicionadorDeAr.reduzirTemperatura(termostato);
		termostato.getTemperatura();
		
		//condicionadorDeAr.reduzirTemperatura(termostato);
		//termostato.getTemperatura();
		
		//condicionadorDeAr.reduzirTemperatura(termostato);
		//termostato.getTemperatura();
		
		//condicionadorDeAr.reduzirTemperatura(termostato);
		//termostato.getTemperatura();
		
		//IMPRIMIR DADOS
		System.out.println(condicionadorDeAr.imprimirTemperatura(termostato));
		
		
		
		
		//FALTA COLOCAR O "DO-WHILE" FAÇA TUDO ISSO SE ESTIVER LIGADO. CASO DESLIGADO NÃO FAZER
		//FALTA AJUSTAR O MÉTODO DE RESUMO DO CONDICIONADOR DE AR
	}

}
