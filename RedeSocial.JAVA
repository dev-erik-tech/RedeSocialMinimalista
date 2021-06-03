/**AD1_2021_1 POO ERIK FREITAS
 * 
 */
/** O código fornecido no enunciado, apontam 03 classes imputadas pelo comando new, logo como segue:**/

 import java.util.ArrayList;
import java.util.List;

 class Amigo {
    private String nome;
    private List<Post> posts = new ArrayList<>(); /**criei um ArrayList para armazenamento de postagens**/

    public Amigo(String nome) { /**construtor para iniciar a classe Amigo**/
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) { 
        this.nome = nome;
    }
    
    public void postar(Post post){ /**metodo postar**/
        posts.add(post);
    }
    
    public void curtir(Post post){ /**metodo curtir**/
        post.setCurtida(post.getCurtida()+1);
    }
    
    public Post retornaPostMaisCurtido(){/**metodo para retornar o posto mais curtido**/
        int maiorCurtida=0;
        if(posts.size()>1){
            for(int i=0; i<posts.size(); i++){
                if(posts.get(i).getCurtida()>maiorCurtida){
                    maiorCurtida = posts.get(i).getCurtida();
                }
            }
        }       
      return posts.get(maiorCurtida) ;
    }
     
    @Override
    public String toString() {
        return "\n" + nome + posts.toString();/** conertendo objeto em String nome+posts**/
 
    }
    
}
  class Post {
    private String conteudo;
    private int curtida;

    public Post(String conteudo) {    /**metodo construtor da classe Post**/
        this.conteudo = conteudo;
        this.curtida = 0;
    }
 
    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) { 
        this.conteudo = conteudo;
    }

    public int getCurtida() { 
        return curtida;
    }

    public void setCurtida(int curtida) {
        this.curtida = curtida;
    }
    
   

    @Override
    public String toString() {
        return conteudo +": " + curtida + " curtidas\n";
    }
    
    
    
}


class Rede {
    final  int MAX_AMIGOS=99;
       int Amigo;
    
    public List<Amigo> rede = new ArrayList<>();/**classe Rede, com instancia de uma lista de List<Amigo>**/

    public List<Amigo> getRede() {
        return rede;
    }

    public void adicionarAmigo(Amigo amigo) {/** metodo para adicionar amigo seguindo a regra de limite de amigos**/
        if (Amigo == MAX_AMIGOS)
             System.out.println("Limite de amigos!");
        else{
        rede.add(amigo);}}
    
     
    public String timeline(){ /**metodo timeline já exibindo as postagens e curtidas dentro da rede**/
          
        for(int i=0; i<rede.size(); i++){
          
        }int i =0;
       
      
           return rede.get(i)+""+this.rede;
          
           
           
           
    } 
}        

 
public class AD1_2021_1 {
public static void main(String[] args) {
Amigo fulano = new Amigo("Fulano");
Amigo ciclano = new Amigo("Ciclano");
Amigo beltrano = new Amigo("Beltrano");
Rede paraiso = new Rede();
paraiso.adicionarAmigo(fulano);
paraiso.adicionarAmigo(ciclano);
paraiso.adicionarAmigo(beltrano);
Post bomdia = new Post("Bom dia!");
Post boatarde = new Post("Bom tarde!");
Post boanoite = new Post("Bom noite!");
fulano.postar(bomdia);
fulano.postar(boatarde);
ciclano.postar(boanoite);
beltrano.curtir(bomdia);
beltrano.curtir(boatarde);
beltrano.curtir(boanoite);
fulano.curtir(boanoite);
System.out.println("Timeline:");
System.out.println(paraiso.timeline());
System.out.println("Post mais curtido de um usuário:");
Post maiscurtido = ciclano.retornaPostMaisCurtido();
System.out.println(maiscurtido);
System.out.println("Quem curtiu: " +
maiscurtido.retornaNomesQueCurtiram());
}
}


        
    
    

