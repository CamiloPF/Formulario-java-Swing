

public class CuerpoDeAgua extends ObjetoGeografico {
    private String TipoCuerpoAgua;
    private String TipoAgua;
    private float IRCA;

    public CuerpoDeAgua(String TipoCuerpoAgua, String TipoAgua, float IRCA, String Nombre, int idCuerpoAgua, String Municipio) {
        super(Nombre, idCuerpoAgua, Municipio);
        this.TipoCuerpoAgua = TipoCuerpoAgua;
        this.TipoAgua = TipoAgua;
        this.IRCA = IRCA;
    }

    public float getIRCA() {
        return IRCA;
    }

    public void setIRCA(float IRCA) {
        this.IRCA = IRCA;
    }

    public String getTipoCuerpoAgua() {
        return TipoCuerpoAgua;
    }

    public void setTipoCuerpoAgua(String TipoCuerpoAgua) {
        this.TipoCuerpoAgua = TipoCuerpoAgua;
    }

    public String getTipoAgua() {
        return TipoAgua;
    }

    public void setTipoAgua(String TipoAgua) {
        this.TipoAgua = TipoAgua;
    }
    
    
    public String nivel(){
        String riesgo= "";
        if (IRCA >= 80){
            riesgo = "INVIABLE SANITARIAMENTE";
        }else if (IRCA >= 35){
            riesgo = "ALTO";
        }else if (IRCA >= 14){
            riesgo = "MEDIO";
        }else if (IRCA >= 5){
            riesgo = "BAJO";
        }else if (IRCA >= 0){
            riesgo = "SIN RIESGO";
        }
        return riesgo;
    }   
}
