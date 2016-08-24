import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.Array;


public class ListarAlunos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SessionFactory fabrica = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session sessao = fabrica.openSession();
			
			List<Aluno> lista_aluno = new ArrayList();
			lista_aluno = sessao.createQuery("from Aluno").list();
			int tamanho_lista = lista_aluno.size();
			for (int i = 0; i < tamanho_lista; i++) {
				Aluno aluno = lista_aluno.get(i);
				System.out.println("  "+aluno.getAlu_codigo()+" - "+aluno.getAlu_nome()+" "+aluno.getAlu_fone()+" "+aluno.getAlu_cidade());
			}
			
			sessao.close();
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("ERRO: "+e);
		}
		
		
	}
}
