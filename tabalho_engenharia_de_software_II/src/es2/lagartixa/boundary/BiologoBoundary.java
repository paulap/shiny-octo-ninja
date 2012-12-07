package es2.lagartixa.boundary;

import es2.lagartixa.controladores.CadastrarEspecieControl;
import es2.lagartixa.entidades.Genero;

public class BiologoBoundary {
	public static void main(String[] args) {
		CadastrarEspecieControl lag1 = new CadastrarEspecieControl();

		lag1.CadastrarEspecie(
				"Lagartixa-da-madeira",
				"Lacerta dugesii",
				"Lacerta dugesii Milne-Edwards, 1829, conhecida pelo nome comum de lagartixa-da-madeira, � uma esp�cie de pequeno lagarto pertencente � fam�lia Lacertidae.",
				"L. dugesii",
				new Genero(
						"Lacerta � um g�nero de r�pteis escamados pertencente � fam�lia Lacertidae.",
						"Lacerta"));
		lag1.ConsultarEspecie();
	}
}