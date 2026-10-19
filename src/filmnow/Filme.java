import java.util.*;
package filmnow;

public class Filme {
    private String nome;
    private String ondeVer;
    private int anoLanc;
    private boolean ehHot;

    /**
     * cria o objeto Filme.
     *
     * @param nome do filme.
     * @param anoLanc ano de lançamento do filme.
     * @param ondeVer o filme.
     */
    public Filme(String nome, int anoLanc, String ondeVer) {
        this.nome = nome;
        this.anoLanc = anoLanc;
        this.ondeVer = ondeVer;
        ehHot = false;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return ondeVer;
    }

    public int getAno() {
        return anoLanc;
    }

    public boolean isHot() {
        return ehHot;
    }

    public void setHot(boolean cond) {
        this.ehHot = cond;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(obj == null)
            return false;
        if (this.getClass() != obj)
            return false;
        Filme other = (Filme) obj;
        return Objects.equals(nome, other.nome) &&  Objects.equals(ondeVer,other.ondeVer) && anoLanc == other.anoLanc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ondeVer, anoLanc);
    }

    @Override
    public String toString() {
        return nome + " " + ","+ " "+anoLanc + "\n"
                + ondeVer;
    }
}
