package com.model.mahasiswa;

public class Biodata {
	private String nim;
	private String nama;
	private String jk;
	private String tmp_lahir;
	private String tgl_lahir;
	private String alamat;
	public String getNim() {
		return nim;
	}
	public void setNim (String nim) {
		this.nim=nim;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama=nama;
	}
	public String getJk() {
		return jk;
	}
	public void setJk(String jk) {
		this.jk=jk;
	}
	public String getTglLahir() {
		return tgl_lahir;
	}
	public void setTglLahir(String tgl_lahir) {
		this.tgl_lahir=tgl_lahir;
	}
	public String getTmpLahir() {
		return tmp_lahir;
	}
	public void setTmpLahir(String tmp_lahir) {
		this.tmp_lahir= tmp_lahir;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat=alamat;
	}


}
