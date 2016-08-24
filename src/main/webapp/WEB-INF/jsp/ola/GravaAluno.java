import org.hibernate.*;
import org.hibernate.cfg.*;
public class GravaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SessionFactory fabrica = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session sessao = fabrica.openSession();
			
			Aluno aluno = new Aluno();
			aluno.setAlu_codigo(7);
			aluno.setAlu_nome("+ + Outro Calos Joao carlos");
			aluno.setAlu_fone("11 3985-547");
			aluno.setAlu_cidade("Sao Paulo");
			aluno.setAlu_curso("Direito");
			
			aluno.setAlu_codigo(7);
			aluno.setAlu_nome("+ + Outro Calos Joao carlos");
			aluno.setAlu_fone("11 3985-547");
			aluno.setAlu_cidade("Sao Paulo");
			aluno.setAlu_curso("Direito");
			
			Transaction tx_aluno = sessao.beginTransaction();
			sessao.save(aluno);
			tx_aluno.commit();
			sessao.close();
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("ERRO: "+e);
		}
		
		
	}

}
