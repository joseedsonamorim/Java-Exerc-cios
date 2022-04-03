package questao1;

public class MaquinaBilhete
{
    private float preco;
    private float saldo;
    private float total;
    public float falta;

    public MaquinaBilhete(float custo)
    {
      this.falta = preco - saldo;
      this.preco = preco;
      this.saldo = 0;
      this.total = 0;
    }

    public float getPreco()
    {
        return preco;
    }


    public float getSaldo()
    {
        return saldo;
    }
    
    public float getTotal(){
        return total;
    }


    public void colocarDinheiro(float quantidade)
    {
        this.saldo = saldo + quantidade;
    }

    public void emitir()
    {
        if (saldo >= preco) 
        {
            this.total = total + preco;
            this.saldo = saldo - preco;    
            System.out.println("Bilhete emitido");
        }else
        {
            if (saldo < preco) 
            {
                System.out.println("Saldo insuficiente. Acrecente no saldo pelo menos R$" + falta);
                
            }
        }
    }

    public float darTroco()
    {

        return saldo;
    }
}
