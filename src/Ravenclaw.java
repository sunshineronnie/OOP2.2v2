public class Ravenclaw extends Hogvarts {


        private int wit;
        private int clever;
        private int wisdom;
        private int creation;

        @Override
        public String toString() {
            return "Ravenclaw: " +
                    "wit=" + wit +
                    ", clever=" + clever +
                    ", wisdom=" + wisdom +
                    ", creation=" + creation +
                    ", fullName='" + fullName + '\'' +
                    ", magic=" + magic +
                    ", transgrestion=" + transgrestion;
        }

        public void compareStudent(Ravenclaw studentSecond) {
            int powerOne = this.wisdom + this.clever + this.wit + this.creation;
            int powerTow = studentSecond.wisdom + studentSecond.clever + studentSecond.wit + studentSecond.creation;
            if (powerOne > powerTow) {
                System.out.println(this.fullName + " better than " + studentSecond.fullName);
            } else if (powerOne < powerTow) {
                System.out.println(studentSecond.fullName + " better than " + this.fullName);
            } else {
                System.out.println(" Similar power");
            }
        }






        public Ravenclaw(String fullName, int magic, int transgrestion, int wit, int clever, int wisdom, int creation) {
            if (wit < 0 || wit > 100) {
                throw new RuntimeException(" Invalid number wit");
            }
            if (clever < 0 || clever > 100) {
                throw new RuntimeException(" Invalid number clever");
            }

            if (wisdom < 0 || wisdom > 100) {
                throw new RuntimeException(" Invalid number wisdom");
            }
            if (creation < 0 || creation > 100) {
                throw new RuntimeException(" Invalid number creation");
            }
            this.wit = wit;
            this.clever = clever;
            this.wisdom = wisdom;
            this.creation = creation;
            this.transgrestion = transgrestion;
            this.magic = magic;
            this.fullName = fullName;
        }

        public int getWit() {
            return wit;
        }

        public void setWit(int wit) {
            this.wit = wit;
        }

        public int getClever() {
            return clever;
        }

        public void setClever(int clever) {
            this.clever = clever;
        }

        public int getWisdom() {
            return wisdom;
        }

        public void setWisdom(int wisdom) {
            this.wisdom = wisdom;
        }

        public int getCreation() {
            return creation;
        }

        public void setCreation(int creation) {
            this.creation = creation;
        }
    }
