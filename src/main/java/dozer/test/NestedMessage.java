package dozer.test;

public class NestedMessage
{
	public static class Inner {

		private String prop1;
		
		public Inner() {
		}
		
		public String getProp1() {
			return prop1;
		}
		
		public void setProp1(String prop1) {
			this.prop1 = prop1;
		}
	}
	
	public static class Outer {
		private String prop2;
		private Inner prop1;
		
		public Outer(){
			
		}
		
		public String getProp2() {
			return prop2;
		}
		
		public void setProp2(String prop2) {
			this.prop2 = prop2;
		}
		
		public Inner getProp1() {
			return prop1;
		}
		
		public void setProp1(Inner prop1) {
			this.prop1 = prop1;
		}
	}
	
	public static class Colors {
		public enum Color {
			RED, BLUE, GREEN;
		}
		
		private Color color;
		
		public Colors()
		{
			
		}
		
		public Color getColor() {
			return color;
		}
		
		public void setColor(Color color) {
			this.color = color;
		}
		
		
	}
}
