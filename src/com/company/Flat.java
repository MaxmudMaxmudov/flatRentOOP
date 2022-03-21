package com.company;

public class Flat {
	private String code;
	private int smq;
	private double [] tariffs;
	private boolean[] freeWeeks= new boolean[52];



	public Flat() {

	}

	public Flat(String code, int smq) {
		this.code = code;
		this.smq = smq;
		for(int i= 1 ; i <52 ; i++){
			freeWeeks[i]=true;
		}
	}

	public Flat(String code, int smq, double[] tariffs) {
		this.code = code;
		this.smq = smq;
		this.tariffs = tariffs;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getSmq() {
		return smq;
	}

	public void setSmq(int smq) {
		this.smq = smq;
	}

	public String getCode() {
		return code;
	}

	public int getDimension() {
		return smq;
	}

	public double[] getTariffs() {
		return tariffs;
	}
	
	public void setTariffs(double[] tariffs) {
		this.tariffs=tariffs;

	}

	public boolean[] getAvailability() {

		return freeWeeks;
	}


	public  void setAvailability(int startWeek,int endWeek){
		for(int i = startWeek; i<startWeek + endWeek ; i++ ){
			this.freeWeeks[i] = false;
		}

	}

	public double getOccupancy() {
		double busy =0;
		for (int i = 0; i < 52; i++) {
			if (freeWeeks[i]==false){
				busy++;
			}

		}
		return busy/52;
	}

}
