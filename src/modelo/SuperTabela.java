package modelo;

import utils.ReflexaoTabela;

public abstract class SuperTabela<TypePK> {
	public String getPkName() {
		return ReflexaoTabela.getPkName(this);
	}

	public TypePK getPk() {
		return (TypePK) ReflexaoTabela.getPkValue(this);
	}
	public void setPk(TypePK value) {
		ReflexaoTabela.setPkValue(this,value);
	}
	public String getTableName(){
		return utils.ReflexaoTabela.getTableName(this);
	}

	public Boolean isCamposObrigatoriosPreenchidos(){
		ReflexaoTabela.validarCamposObrigatorios(this);
		return true;
	}
}
