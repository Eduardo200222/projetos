public class Aviao {
    private int numeroaviao;
    private double velocidademax;
    private double velocidademin = 0;
    private double velocidadeatual;
    private double peso;
    private boolean ligado = false;

    public Aviao(int numeroaviao, double velocidademax,double velocidadeatual) {
        this.numeroaviao = numeroaviao;
        this.velocidademax = velocidademax;
        this.velocidadeatual = velocidadeatual;


    }

    public void ligar() {
        if (this.ligado) {
            System.out.println(" o avião já está ligado ");

        } else {
            this.ligado = true;
            System.out.println(" ligamos o avião ");
        }

    }

    public void desligar() {
        if (this.velocidadeatual == 0) {
            if (this.ligado) {
                this.ligado = false;
                System.out.println(" Desligamos o Avião! ");

            } else {
                System.out.println(" o Avião já está desligado! ");
            }
        } else {
            System.out.println(" O Avião precisa está parado pra que possa Desligar! ");
        }

    }

    public void decolar(double valorDecolagem) {
        if (this.ligado) {
            if (this.velocidademax <= this.velocidadeatual + valorDecolagem) {
                this.velocidadeatual += valorDecolagem;
                System.out.println(" o avião está na velocidade permitida para decolar "
                        + this.velocidadeatual + " km/h ");

            } else {
                this.velocidadeatual += valorDecolagem;
                System.out.println(" o avião não está na velocidade permitida para decolar "
                        + this.velocidadeatual + " km/h ");
            }

        } else {
            System.out.println("não podemos decolar com o avião desligado!");
        }

    }


    public void frear(double valordeposagem){
        if (this.ligado){
            if (this.velocidademin < this.velocidadeatual - valordeposagem){
                this.velocidadeatual -= valordeposagem;
                if (this.velocidadeatual==0){
                    System.out.println(" O avião está parando! ");
                }else{
                    System.out.println("o avião está a : " + this.velocidadeatual + " km/h ");
                }

            }else {
                this.velocidadeatual = 0;
                System.out.println(" o avião parou! ");
            }
        }


        }

        public void parar(){
        if (this.ligado){
           if (this.velocidadeatual>0){
               this.velocidadeatual= 0;
               System.out.println(" o avião parou! ");
           }else{
               System.out.println(" o avião já está parado ");
           }
        }else{
            System.out.println("o avião está parado e desligado");
        }

    }

}





