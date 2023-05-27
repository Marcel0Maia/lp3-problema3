package tce1_3;

import java.util.ArrayList;

public class BalaDeCanhao {
	
	private double posx;
	private double posy;
	private double velx;
	private double vely;	
	
	public BalaDeCanhao() {
	}
	
	public BalaDeCanhao(double posx, double posy) {
		this.posx = 0;
		this.posy = 0;
	}
	
	public void setPosx(double posx) {
		this.posx += posx;
	}
	public void setPosy(double posy) {
		this.posy += posy;
	}
	public void setVelx(double velx) {
		this.velx = velx;
	}
	public void setVely(double vely) {
		this.vely = vely;
	}
	
	public double getPosx() {
		return posx;
	}
	public double getPosy() {
		return posy;
	}
	public double getVelx() {
		return velx;
	}
	public double getVely() {
		return vely;
	}
	
	public void mover(double deltaSegundos) {
		double disx = getVelx() * deltaSegundos;
		double disy = getVely() * deltaSegundos;
		
		setPosx(disx);
		setPosy(disy);
		
		setVely(getVely() - 9.81);
	}
	
	public Ponto getLocalizacao() {
		int x = (int)Math.round(posx);
		int y = (int)Math.round(posy);
		
		
		return new Ponto(x, y);
		
	}
	
	public ArrayList<Ponto> atirar(double alpha, double v, double deltaSegundos){
		ArrayList<Ponto> localizacao = new ArrayList<>();
		
		setVelx(v * Math.cos(alpha));
		setVely(v * Math.sin(alpha));
		
		while(getPosy() >= 0) {
			
			mover(deltaSegundos);
			localizacao.add(getLocalizacao());
			
		}
		
		return localizacao;
	}
}
