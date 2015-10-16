/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Tadeu
 */
public class Inventario {
    private String codEmpresa;
    private String dataInv;
    private String codprod;
    private String documento;
    private String codgrade;
    private String quantidade;
    private String precocusto;
    private String processado;
    private String usuario;
    private String codcausa;

    public String getCodcausa() {
        return codcausa;
    }

    public void setCodcausa(String codcausa) {
        this.codcausa = codcausa;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getProcessado() {
        return processado;
    }

    public void setProcessado(String processado) {
        this.processado = processado;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCodgrade() {
        return codgrade;
    }

    public void setCodgrade(String codgrade) {
        this.codgrade = codgrade;
    }

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public String getDataInv() {
        return dataInv;
    }

    public void setDataInv(String dataInv) {
        this.dataInv = dataInv;
    }

    public String getCodprod() {
        return codprod;
    }

    public void setCodprod(String codprod) {
        this.codprod = codprod;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getPrecocusto() {
        return precocusto;
    }

    public void setPrecocusto(String precocusto) {
        this.precocusto = precocusto;
    }
}
