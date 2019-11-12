package br.com.view;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;


import br.com.controller.AlunoServiceHibernate;
import br.com.hibernate.dao.HDAO;
import br.com.model.Aluno;
import br.com.model.Telefone;

public class AppHibernate {

	public static void main(String[] args) {
		int i = 1;
		AlunoServiceHibernate service = new AlunoServiceHibernate();
		while (i != 0) {
			i = Integer.parseInt(JOptionPane.showInputDialog(
					"Para inserir um aluno digite 1\nPara editar um aluno digite 2\nPara apagar digite 3\nPara buscar digite 4\nPara buscar todos digite 5\nPara sair digite qualquer outra coisa"));
			switch (i) {

			case 1:
				Aluno a2 = new Aluno ();
				a2.setIdAluno(Integer.parseInt(JOptionPane.showInputDialog("Informe o id")));
				a2.setNome(JOptionPane.showInputDialog("Digite o nome"));
				a2.setMatricula(JOptionPane.showInputDialog("Digite a matricula"));
				Telefone t1 = new Telefone();
				t1.setIdTelefone(1);
				a2.setTelefone(t1);
				JOptionPane.showMessageDialog(null, service.addAluno(a2));
				break;

			case 2:
				Aluno a1 = new Aluno ();
				a1.setIdAluno(Integer.parseInt(JOptionPane.showInputDialog("Informe o id do Aluno:")));
				a1.setNome(JOptionPane.showInputDialog("Digite o nome a ser atualizado"));
				a1.setMatricula(JOptionPane.showInputDialog("Digite a matricula a ser atualizado"));
				Telefone t = new Telefone();
				t.setIdTelefone(1);
				a1.setTelefone(t);
				JOptionPane.showMessageDialog(null, service.editAluno(a1));
				break;

			case 3:
				Aluno a = new Aluno();
				a.setIdAluno(Integer.parseInt(JOptionPane.showInputDialog("Informe o id do Aluno:")));
				JOptionPane.showMessageDialog(null, service.deleteAluno(a));
				break;
				
			case 4:
				JOptionPane.showMessageDialog(null,
						service.findByIdAluno(Integer.parseInt(JOptionPane.showInputDialog("Informe o id do Aluno:"))));
				break;
				
			case 5:
				JOptionPane.showMessageDialog(null, service.findAllAlunos());
				break;
				
			default:
				i = 0;
				break;
			}

		}
		
		
		
		
		
	}
}