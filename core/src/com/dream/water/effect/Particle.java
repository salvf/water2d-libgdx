package com.dream.water.effect;

import com.badlogic.gdx.math.Vector2;

public class Particle {
	
	private Vector2 position;
	private Vector2 velocity;
	private float orientation;
	
	public Particle(Vector2 position, Vector2 velocity, float orientation){
		this.position = position;
		this.velocity = velocity;
		this.orientation = orientation;
	}
	
	public void update(){
		final float gravity = 0.3f;
		
		velocity.y += gravity;
		position.add(velocity);
		orientation = getAngle();
	}
	
	private float getAngle(){
		return (float) Math.atan2(velocity.y, velocity.x);
	}
	
	public Vector2 getPosition() {
		return position;
	}
	public void setPosition(Vector2 position) {
		this.position = position;
	}
	public Vector2 getVelocity() {
		return velocity;
	}
	public void setVelocity(Vector2 velocity) {
		this.velocity = velocity;
	}
	public float getOrientation() {
		return orientation;
	}
	public void setOrientation(float orientation) {
		this.orientation = orientation;
	}
	
}
