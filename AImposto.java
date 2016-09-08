package br.unipe.mlpII.impostoderenda.model1;

public class AImposto implements Imposto{
    
    private AAliquota aliquota;
    
    public void setCorrectAliquota(double valor){
        if(valor <= 1700){
            aliquota = new Aliquota1();
        }else if(valor > 1700 && valor < 2560 ){
            aliquota = new Aliquota2();
        }else
            aliquota = new Aliquota3();
    }
    public double calculoImposto(Pessoa p){
        setCorrectAliquota(p.getReceita());
        return aliquota.getTaxa()*p.getReceita();
    }
    
    public double getAliquota(Pessoa p){
        return aliquota.getTaxa();
    }
}
