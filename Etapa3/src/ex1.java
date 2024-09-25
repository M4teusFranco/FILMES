
public class ex1 {

	public static class Filme {
	    String titulo;
	    int duracao;
	    String genero;

	  
	    public Filme (String titulo, int duracao, String genero) {
	    	ValidaTitulo(titulo);   
	        ValidaMinuto(duracao);  
	        ValidaGenero(genero);
	    	this.titulo=titulo;
	    	this.duracao=duracao;
	    	this.genero=genero;
	    }


	    public void ValidaTitulo(String titulo) {
	        if (titulo == null || titulo.trim().isEmpty()) {
	        System.out.println("O título não pode estar vazio.");
	        }
	     
	    }


	    public void ValidaMinuto(int duracao) {
	        if (duracao <= 0) {
	            System.out.println("A duração deve ser maior que zero.");
	        }
	    }

	    public void ValidaGenero(String genero) {
	    	if(!genero.equalsIgnoreCase("Romance") &&
	                !genero.equalsIgnoreCase("Terror") &&
	                !genero.equalsIgnoreCase("Comédia")) {
	                System.out.println("O gênero deve ser Romance, Terror ou Comédia.");
	            }
	    }

	    public void descricao() {
	        System.out.println("Título: " + titulo);
	        System.out.println("Duração: " + duracao+ " min");
	        System.out.println("Gênero: " + genero);
	    }

	    public static void main(String[] args) {
	    	
	    	
	    	Filme filme = new Filme("Titanic ",195,"Romance");
	    	
	    	filme.descricao();
	    	
	    }
	}
}