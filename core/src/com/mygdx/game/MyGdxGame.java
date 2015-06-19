package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.util.Random;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;

public class MyGdxGame extends ApplicationAdapter {
	Random ran = new Random();
	SpriteBatch batch;
	Texture img1,img2,img3,cpu1,cpu2,cpu3;
	boolean visible1=false;
	boolean visible2=false;
	boolean visible3=false;
	boolean visible4=false;
	boolean visible5=false;
	boolean visible6=false;
	int computer_choice = ran.nextInt(2)+1;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img1 = new Texture("tijera.jpg");
		img2 = new Texture("piedra.jpg");
		img3 = new Texture("papel.jpg");
		cpu1 = new Texture("piedra.jpg");
		cpu2 = new Texture("papel.jpg");
		cpu3 = new Texture("tijera.jpg");

	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		if(visible1) {
			batch.draw(img1, 0, 0);
		}
		if(visible2) {
			batch.draw(img2, 0, 0);
		}
		if(visible3) {
			batch.draw(img3, 0, 0);
		}
		if(visible4) {
			batch.draw(cpu1, 350, 250);
		}
		if(visible5) {
			batch.draw(cpu2, 350, 250);
		}
		if(visible6) {
			batch.draw(cpu3, 350, 250);
		}
		batch.end();


		if(Gdx.input.isKeyPressed(Input.Keys.A)){
			visible1=true;
			switch (computer_choice)
			{
				case 1:
					visible4=true;
					break;

				case 2:
					visible5=true;
					break;

				case 3:
					visible6=true;
					break;
			}
			if(computer_choice == 1){
				System.out.println("El Ganador fue la computadora!");
			} else if (computer_choice == 2){
				System.out.println("El Ganador fuiste tu!");
			} else if (computer_choice == 3){
				System.out.println("Empatados!");
			}

		}
		if(Gdx.input.isKeyPressed(Input.Keys.S)){
			visible2=true;
			switch (computer_choice)
			{
				case 1:
					visible4=true;
					break;

				case 2:
					visible5=true;
					break;

				case 3:
					visible6=true;
					break;
			}
			if(computer_choice == 1){
				System.out.println("Empatados!");
			} else if (computer_choice == 2){
				System.out.println("El Ganador fue la computadora!");
			} else if (computer_choice == 3){
				System.out.println("El Ganador fuiste tu!");
			}
		}
		if (Gdx.input.isKeyPressed(Input.Keys.D)){
			visible3=true;
			switch (computer_choice) {
				case 1:
					visible4=true;
					break;

				case 2:
					visible5 = true;
					break;

				case 3:
					visible6=true;
					break;
			}
			if(computer_choice == 1){
				System.out.println("El Ganador fuiste tu!");
			} else if (computer_choice == 2){
				System.out.println("Empatados!");
			} else if (computer_choice == 3){
				System.out.println("El Ganador fue la computadora!");
			}
		}
		if(Gdx.input.isKeyPressed(Input.Keys.R)) {
			visible1=false;
			visible2=false;
			visible3=false;
			visible4=false;
			visible5=false;
			visible6=false;
		}
	}
}
