package ifsc.poo;

public class Pessoa {
    //atributos;

    private String nome;
    private int idade;

    private static int totalPessoas = 0;

    public Pessoa (String nome) {
        this.verificarNome(nome);
        this.idade = IDADE_PADRAO;
        totalPessoas++;
    }


    public Pessoa (int idade) {
        this.nome = "nome ";
        this.verificarIdade(idade);
        totalPessoas++;

    }

    public Pessoa (String nome, Int idade) {
        this.verificarNome(nome);
        this.verificarIdade(idade);
        totalPessoas++;

    }
          public static int GetTotalPessoas() {
                return totalPessoas;
            }
              public void setNome(String nome) {
                  verificarNome(nome);

                }

              public String getNome(){
                 return this.nome;

              }
              public void setIdade (int idade){
                  verificarIdade(idade);


              }
              public int getIdade(){
                  return this.idade;


              }

              public void felizAniversario(){
                   this.idade++;

    }

              private void verificarIdade (Int idade){
             if (idade >= 0) {
                 this.idade = idade;
             } else {
                 this.idade = IDADE_PADRAO;
             }
       }
          private void verificarNome(String nome){
              if (nome.trim().isEmpty()) {
                  this.nome = NOME_PADRAO;
} else{
  this.nome = nome;
    }
}

















