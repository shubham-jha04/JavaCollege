
    interface drawable{
        void draw();

    }
    class Rectangle implements drawable{
        public void draw(){
            System.out.println("drawing rectangle");
    }
    }
    class Circle implements drawable{
        public void draw(){
            System.out.println("drawing circle");
        }
    }
    class Interface{
        public static void main(String[] args) {
            drawable d = new Circle();
            d.draw();

        }
    }

