package hu.bme.mit.mdsd.dns2016.drones.simulation.helpers;

public class Vec3f {
	public float x;
	public float y;
	public float z;

	public Vec3f() {

	}

	public Vec3f(float x, float y, float z) {
		set(x, y, z);
	}
	
	public Vec3f(Vec3f vector) {
		set(vector);
	}
	
	public void set(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void set(Vec3f vector) {
		this.x = vector.x;
		this.y = vector.y;
		this.z = vector.z;
	}
	
	public void scale(float scalar) {
		x *= scalar;
		y *= scalar;
		z *= scalar;
	}
	
	public float getLength(){
		return (float) Math.sqrt(x*x + y*y + z*z);
	}
	
	public void Normalize(){
		float length = getLength();
		x /= length;
		y /= length;
		z /= length;
	}
	
	public float getDistance(Vec3f vector) {
		final float xd = x - vector.x;
		final float yd = y - vector.y;
		final float zd = z - vector.z;
			
		return (float) Math.sqrt(xd * xd + yd * yd + zd * zd);
	}
	
	public static Vec3f addVectors(Vec3f a, Vec3f b) {
		return new Vec3f(a.x + b.x, a.y + b.y, a.z + b.z);
	}
	
	public static Vec3f scaleVector(Vec3f a, float scalar) {
		Vec3f scaledVector = new Vec3f(a);
		scaledVector.scale(scalar);
		return scaledVector;
	}
	
	public static Vec3f substractVectors(Vec3f a, Vec3f b) {
		return new Vec3f(a.x - b.x, a.y - b.y, a.z - b.z);
	}
	
	public static Vec3f getDirectionVector(Vec3f from, Vec3f to) {
		Vec3f directionVector = Vec3f.substractVectors(to, from);
		directionVector.Normalize();
		return directionVector;
	}
}
