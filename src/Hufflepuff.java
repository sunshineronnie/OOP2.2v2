
    public class Hufflepuff extends Hogvarts{


        private int industriousness;
        private int honesty;
        private int fidelity;

        @Override
        public String toString() {
            return "Hufflepuff: " +
                    "industriousness=" + industriousness +
                    ", honesty=" + honesty +
                    ", fidelity=" + fidelity +
                    ", fullName='" + fullName + '\'' +
                    ", magic=" + magic +
                    ", transgrestion=" + transgrestion;
        }

        public void compareStudent(Hufflepuff studentSecond) {
            int powerOne = this.fidelity + this.honesty + this.industriousness;
            int powerTow = studentSecond.fidelity + studentSecond.honesty + studentSecond.industriousness;
            if (powerOne > powerTow) {
                System.out.println(this.fullName + " better than " + studentSecond.fullName);
            } else if (powerOne < powerTow) {
                System.out.println(studentSecond.fullName + " better than " + this.fullName);
            } else {
                System.out.println(" Similar power");
            }
        }

        public Hufflepuff(String fullName, int magic, int transgrestion, int industriousness, int honesty, int fidelity) {
            if (honesty < 0 || honesty > 100) {
                throw new RuntimeException(" Invalid number honesty");
            }
            if (industriousness < 0 || industriousness > 100) {
                throw new RuntimeException(" Invalid number industriousness");
            }
            if (fidelity < 0 || fidelity > 100) {
                throw new RuntimeException(" Invalid number bravery");
            }
            this.industriousness = industriousness;
            this.honesty = honesty;
            this.fidelity = fidelity;
            this.transgrestion = transgrestion;
            this.magic = magic;
            this.fullName = fullName;
        }

        public int getIndustriousness() {
            return industriousness;
        }

        public void setIndustriousness(int industriousness) {
            this.industriousness = industriousness;
        }

        public int getHonesty() {
            return honesty;
        }

        public void setHonesty(int honesty) {
            this.honesty = honesty;
        }

        public int getFidelity() {
            return fidelity;
        }

        public void setFidelity(int fidelity) {
            this.fidelity = fidelity;
        }
    }


