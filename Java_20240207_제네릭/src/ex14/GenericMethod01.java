package ex14;


class Box<T>{   //T --> String
			private T obj;
			
			void set(T obj) {
				this.obj = obj;
			}
			
			T get() {
				return this.obj;
			}
		}

		class BoxFactory{
			//제네릭 메소드  <T> 제네릭 메서드 표시
			//Box<T> : 반환타입, makeBox:함수명 (T o) : 매개변수 
			public static <T extends Number> Box<T> makeBox(T o){
				Box<T> box = new Box() ;
				box.set(o);
				System.out.println("Boxed : " + o.intValue());
				return box;
				}
			}
		
		class Unboxer{
			public static <T extends Number> T openBox(Box<T> box) {
				System.out.println("unboxed :" + box.get().intValue());
				return box.get();
			}
		}
		public class GenericMethod01 {

			public static void main(String[] args) {
				
				Box<Integer> ibox = BoxFactory.makeBox(new Integer(100));
				
				
				int num = Unboxer.openBox(ibox);
				
				System.out.println("data : " + num);
		
		
		
	}

}
