/**
 * 
 */
package br.edu.unoesc.edi.bim.db.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * @author Marcelo
 *
 *         Modelo de tabela para salvar todas as avaliações feitas usando os
 *         autores disponíveis, podendo se fazer de uso para futuras comparações
 *         e relatórios.
 */
@DatabaseTable(tableName = "procedures")
public class Procedures {

	private static final String ID = "ID";
	private static final String STUDENT_FIELD_STUDENTID = "STUDENT_ID";
	private static final String STUDENT_FIELD_TYPE_OF_PROCEDURE = "TYPE_OF_PROCEDURE";
	private static final String STUDENT_FIELD_AGE = "AGE";
	private static final String STUDENT_FIELD_WEIGHT = "WEIGHT";
	private static final String STUDENT_FIELD_HEIGHT = "HEIGHT";
	private static final String STUDENT_FIELD_TRICEPS = "TRICEPS";
	private static final String STUDENT_FIELD_TRICIPTAL = "TRICIPTAL";
	private static final String STUDENT_FIELD_PANTURRILHA = "PANTURRILHA";
	private static final String STUDENT_FIELD_BICIPTAL = "BICIPTAL";
	private static final String STUDENT_FIELD_SUBESCAPULAR = "SUBESCAPULAR";
	private static final String STUDENT_FIELD_COXA = "COXA";
	private static final String STUDENT_FIELD_ABDOMEN = "ABDOMEN";
	private static final String STUDENT_FIELD_SUPRAILIACA = "SUPRAILIACA";
	private static final String STUDENT_FIELD_PEITORAL = "PEITORAL";
	private static final String STUDENT_FIELD_AXILARMEDIA = "AXILARMEDIA";
	private static final String STUDENT_FIELD_CINTURA = "CINTURA";
	private static final String STUDENT_FIELD_QUADRIL = "QUADRIL";
	private static final String STUDENT_FIELD_PESCOCO = "PESCOCO";
	private static final String STUDENT_FIELD_DENSIDADECORPORAL = "DENSIDADE_CORPORAL";
	private static final String STUDENT_FIELD_PERCENTUALGORDURA = "PERCENTUAL_GORDURA";
	private static final String STUDENT_FIELD_PESOGORDURA = "PESO_GORDURA";
	private static final String STUDENT_FIELD_PESOMAGRO = "PESO_MAGRO";
	private static final String STUDENT_FIELD_PESOIDEAL = "PESO_IDEAL";
	private static final String STUDENT_FIELD_IMC = "IMC";
	private static final String STUDENT_FIELD_RAZAOCINTURALQUADRIL = "RAZAO_CINTURA_QUADRIL";
	private static final String STUDENT_FIELD_SITUACAO = "SITUACAO";

	@DatabaseField(generatedId = true, columnName = ID)
	private Integer id;
	@DatabaseField(canBeNull = false, columnName = STUDENT_FIELD_STUDENTID)
	private Integer idOfStudent;
	@DatabaseField(canBeNull = false, columnName =  STUDENT_FIELD_TYPE_OF_PROCEDURE)
	private Integer typeOfProcedure;
	@DatabaseField(canBeNull = false, columnName = STUDENT_FIELD_AGE)
	private Integer age;
	@DatabaseField(canBeNull = false, columnName = STUDENT_FIELD_WEIGHT)
	private Float weight;
	@DatabaseField(canBeNull = false, columnName = STUDENT_FIELD_HEIGHT)
	private Integer height;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_TRICEPS)
	private Float triceps;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_TRICIPTAL)
	private Float triciptal;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_PANTURRILHA)
	private Float panturrilha;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_BICIPTAL)
	private Float biciptal;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_SUBESCAPULAR)
	private Float subescapular;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_COXA)
	private Float coxa;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_ABDOMEN)
	private Float abdomen;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_SUPRAILIACA)
	private Float supraIliaca;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_PEITORAL)
	private Float peitoral;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_AXILARMEDIA)
	private Float axilarmedia;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_CINTURA)
	private Float cintura;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_QUADRIL)
	private Float quadril;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_PESCOCO)
	private Float pescoco;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_DENSIDADECORPORAL)
	private Float densidadeCorporal;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_PERCENTUALGORDURA)
	private Float percentualGordura;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_PESOGORDURA)
	private Float pesoGordura;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_PESOMAGRO)
	private Float pesoMagro;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_PESOIDEAL)
	private Float pesoIdeal;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_IMC)
	private Float imc;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_RAZAOCINTURALQUADRIL)
	private Float razaoCinturaQuadril;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_SITUACAO)
	private String situacao;

	public Procedures() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdOfStudent() {
		return idOfStudent;
	}

	public void setIdOfStudent(Integer idOfStudent) {
		this.idOfStudent = idOfStudent;
	}

	public Integer getTypeOfProcedure() {
		return typeOfProcedure;
	}

	public void setTypeOfProcedure(Integer typeOfProcedure) {
		this.typeOfProcedure = typeOfProcedure;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Float getTriceps() {
		return triceps;
	}

	public void setTriceps(Float triceps) {
		this.triceps = triceps;
	}

	public Float getTriciptal() {
		return triciptal;
	}

	public void setTriciptal(Float triciptal) {
		this.triciptal = triciptal;
	}

	public Float getPanturrilha() {
		return panturrilha;
	}

	public void setPanturrilha(Float panturrilha) {
		this.panturrilha = panturrilha;
	}

	public Float getBiciptal() {
		return biciptal;
	}

	public void setBiciptal(Float biciptal) {
		this.biciptal = biciptal;
	}

	public Float getSubescapular() {
		return subescapular;
	}

	public void setSubescapular(Float subescapular) {
		this.subescapular = subescapular;
	}

	public Float getCoxa() {
		return coxa;
	}

	public void setCoxa(Float coxa) {
		this.coxa = coxa;
	}

	public Float getAbdomen() {
		return abdomen;
	}

	public void setAbdomen(Float abdomen) {
		this.abdomen = abdomen;
	}

	public Float getSupraIliaca() {
		return supraIliaca;
	}

	public void setSupraIliaca(Float supraIliaca) {
		this.supraIliaca = supraIliaca;
	}

	public Float getPeitoral() {
		return peitoral;
	}

	public void setPeitoral(Float peitoral) {
		this.peitoral = peitoral;
	}

	public Float getAxilarmedia() {
		return axilarmedia;
	}

	public void setAxilarmedia(Float axilarmedia) {
		this.axilarmedia = axilarmedia;
	}

	public Float getCintura() {
		return cintura;
	}

	public void setCintura(Float cintura) {
		this.cintura = cintura;
	}

	public Float getQuadril() {
		return quadril;
	}

	public void setQuadril(Float quadril) {
		this.quadril = quadril;
	}

	public Float getPescoco() {
		return pescoco;
	}

	public void setPescoco(Float pescoco) {
		this.pescoco = pescoco;
	}

	public Float getDensidadeCorporal() {
		return densidadeCorporal;
	}

	public void setDensidadeCorporal(Float densidadeCorporal) {
		this.densidadeCorporal = densidadeCorporal;
	}

	public Float getPercentualGordura() {
		return percentualGordura;
	}

	public void setPercentualGordura(Float percentualGordura) {
		this.percentualGordura = percentualGordura;
	}

	public Float getPesoGordura() {
		return pesoGordura;
	}

	public void setPesoGordura(Float pesoGordura) {
		this.pesoGordura = pesoGordura;
	}

	public Float getPesoMagro() {
		return pesoMagro;
	}

	public void setPesoMagro(Float pesoMagro) {
		this.pesoMagro = pesoMagro;
	}

	public Float getPesoIdeal() {
		return pesoIdeal;
	}

	public void setPesoIdeal(Float pesoIdeal) {
		this.pesoIdeal = pesoIdeal;
	}

	public Float getImc() {
		return imc;
	}

	public void setImc(Float imc) {
		this.imc = imc;
	}

	public Float getRazaoCinturaQuadril() {
		return razaoCinturaQuadril;
	}

	public void setRazaoCinturaQuadril(Float razaoCinturaQuadril) {
		this.razaoCinturaQuadril = razaoCinturaQuadril;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String string) {
		this.situacao = string;
	}

}
