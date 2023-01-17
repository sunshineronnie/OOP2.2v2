public class Griffindoor extends Hogvarts {

        private int honour;
        private int nobility;
        private int bravery;


        @Override
        public String toString() {
            return "Griffindoor: " +
                    " honour = " + honour +
                    ", nobility = " + nobility +
                    ", bravery = " + bravery +
                    ", fullName = " + fullName + '\'' +
                    ", magic = " + magic +
                    ", transgrestion = " + transgrestion
                    ;
        }

        public void compareStudent(Griffindoor  studentSecond) {
            int powerOne = this.bravery + this.nobility + this.honour;
            int powerTow = studentSecond.bravery + studentSecond.honour + studentSecond.nobility;
            if (powerOne > powerTow) {
                System.out.println(this.fullName + " better than " + studentSecond.fullName);
            } else if (powerOne < powerTow) {
                System.out.println(studentSecond.fullName + " better than " + this.fullName);
            } else {
                System.out.println(" Similar power");


            }
        }







        public Griffindoor(String fullName, int magic, int transgrestion, int bravery, int honour, int nobility) {
            if (honour < 0 || honour > 100) {
                throw new RuntimeException(" Invalid number honour");
            }
            if (nobility < 0 || nobility > 100) {
                throw new RuntimeException(" Invalid number nobility");
            }
            if (bravery < 0 || bravery > 100) {
                throw new RuntimeException(" Invalid number bravery");
            }
            this.bravery = bravery;
            this.honour = honour;
            this.nobility = nobility;
            this.transgrestion = transgrestion;
            this.magic = magic;
            this.fullName = fullName;
        }

        public int getNobility() {
            return nobility;
        }

        public void setNobility(int nobility) {
            this.nobility = nobility;
        }

        public int getHonour() {
            return honour;
        }

        public void setHonour(int honour) {
            this.honour = honour;
        }



        public int getBravery() {
            return bravery;
        }

        public void setBravery(int bravery) {
            bravery = bravery;
        }
    }



