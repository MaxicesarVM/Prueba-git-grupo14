
package practicarepasoejercicio3;

import java.time.LocalDate;


public class Curso {
    
    private String codigo;
    private String nombre;
    private LocalDate inicioCurso;
    private LocalDate finCurso;

    public Curso(String codigo, String nombre, LocalDate inicioCurso, LocalDate finCurso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.inicioCurso = inicioCurso;
        this.finCurso = finCurso;
    }

    
    
    
    
    
    
    
    
    
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getInicioCurso() {
        return inicioCurso;
    }

    public void setInicioCurso(LocalDate inicioCurso) {
        this.inicioCurso = inicioCurso;
    }

    public LocalDate getFinCurso() {
        return finCurso;
    }

    public void setFinCurso(LocalDate finCurso) {
        this.finCurso = finCurso;
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + ", inicioCurso=" + inicioCurso + ", finCurso=" + finCurso + '}';
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
