public class Hogvarts {


        String fullName;
        int magic;
        int transgrestion;


        public void compareStudent(Hogvarts studentFirst, Hogvarts studentSecond) {
            int powerOne = studentFirst.magic + studentFirst.transgrestion;
            int powerTow = studentSecond.magic + studentSecond.transgrestion;
            if (powerOne > powerTow) {
                System.out.println(studentFirst.fullName + " better than " + studentSecond.fullName);
            } else if (powerOne < powerTow) {
                System.out.println(studentSecond.fullName + " better than " + studentFirst.fullName);
            } else {
                System.out.println(" Similar power");
            }
        }

        public int getTransgrestion() {
            return transgrestion;
        }

        public void setTransgrestion(int transgrestion) {
            if (transgrestion < 0 || transgrestion > 100) {
                throw new RuntimeException(" Invalid number");
            }
            this.transgrestion = transgrestion;
        }

        public int getMagic() {
            return magic;
        }

        public void setMagic(int magic) {
            if (magic < 0 || magic > 100) {
                throw new RuntimeException(" Invalid number");
            }
            this.magic = magic;
        }



        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }
    }

