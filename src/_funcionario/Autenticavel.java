package _funcionario;

public abstract interface Autenticavel { //interfaces so possuem metodos abstratos
                                         //tambem sao vistas como contratos, ou seja, caso alguma classe implemente esta interface
                                         //ela devera criar os comportamentos dos metodos autentica, getSenha e setSenha
    public boolean autentica (int senha);

    public int getSenha();

    public void setSenha(int senha);
}
