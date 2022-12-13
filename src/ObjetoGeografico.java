

public class ObjetoGeografico {
        private String Nombre;
        private int idCuerpoAgua;
        private String Municipio;

    public ObjetoGeografico(String Nombre, int idCuerpoAgua, String Municipio) {
        this.Nombre = Nombre;
        this.idCuerpoAgua = idCuerpoAgua;
        this.Municipio = Municipio;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getIdCuerpoAgua() {
        return idCuerpoAgua;
    }

    public void setIdCuerpoAgua(int idCuerpoAgua) {
        this.idCuerpoAgua = idCuerpoAgua;
    }
        
        
}
