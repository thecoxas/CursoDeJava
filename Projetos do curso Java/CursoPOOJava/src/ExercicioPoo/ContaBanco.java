package ExercicioPoo;

public class ContaBanco {
    public int numeroConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    // metodo personalizado
    public void estadoAtual() {
        System.out.println("---------------------------------------------------------");
        System.out.println("Numero da conta " + getNumeroConta());
        System.out.println("Tipo da conta " + getTipo());
        System.out.println("Dono da conta " + getDono());
        System.out.println("Saldo da conta " + getSaldo());
        System.out.println("Status da conta " + getStatus());
    }

    // construtor
    ContaBanco(double saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
    }

    // getters e setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // metodos
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "cC") {
            this.setSaldo(50);
        } else if (tipo == "cP") {
            this.setSaldo(150);
        }

    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Voçe precisar zerar sua conta");
        } else if (this.getSaldo() < 0) {
            System.out.println("Voçê precisar quitar sua divida primeiro");
        } else {
            this.status = false;
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(float valor) {
        if (this.getStatus()) {
            // this.saldo = this.saldo + valor;
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depositado com sucesso na conta de: " + getDono());
        } else {
            System.out.println("impossivel depositar");
        }
    }

    public void sacar(float valor) {
        if (this.getStatus()) {
            if (getSaldo() >= valor) {
                this.setSaldo(getSaldo() - valor);
                System.out.println("Saque realizado na conta do: " + getDono());
            } else {
                System.out.println("saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar. Crie a conta primeiro");
        }
    }


    public void pagarMensal() {
        double cobranca = 0;
        if (this.getTipo() == "CC") {
            cobranca = 12.0;
        } else if (this.getTipo() == "CP") {
            cobranca = 20.0;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - cobranca);
            System.out.println("Mensalidade paga com sucesso");

        } else {
            System.out.println("conta nao existe");
        }

    }
}
