
    public class Slytherin extends Hogvarts{

        private int cunning;
        private int ambitious;
        private int adroitness;
        private int resoluteness;
        private int lustOfPower;

        @Override
        public String toString() {
            return "Slytherin: " +
                    "cunning=" + cunning +
                    ", ambitious=" + ambitious +
                    ", adroitness=" + adroitness +
                    ", resoluteness=" + resoluteness +
                    ", lustOfPower=" + lustOfPower +
                    ", fullName='" + fullName + '\'' +
                    ", magic=" + magic +
                    ", transgrestion=" + transgrestion;
        }

        public void compareStudent(Slytherin studentSecond) {
            int powerOne = this.cunning + this.ambitious + this.adroitness + this.resoluteness + this.lustOfPower;
            int powerTow = studentSecond.cunning + studentSecond.ambitious + studentSecond.adroitness + studentSecond.resoluteness + studentSecond.lustOfPower;
            if (powerOne > powerTow) {
                System.out.println(this.fullName + " better than " + studentSecond.fullName);
            } else if (powerOne < powerTow) {
                System.out.println(studentSecond.fullName + " better than " + this.fullName);
            } else {
                System.out.println(" Similar power");
            }
        }











        public int getCunning() {
            return cunning;
        }

        public void setCunning(int cunning) {
            this.cunning = cunning;
        }

        public int getAmbitious() {
            return ambitious;
        }

        public void setAmbitious(int ambitious) {
            this.ambitious = ambitious;
        }

        public int getAdroitness() {
            return adroitness;
        }

        public void setAdroitness(int adroitness) {
            this.adroitness = adroitness;
        }

        public int getResoluteness() {
            return resoluteness;
        }

        public void setResoluteness(int resoluteness) {
            this.resoluteness = resoluteness;
        }

        public int getLustOfPower() {
            return lustOfPower;
        }

        public void setLustOfPower(int lustOfPower) {
            this.lustOfPower = lustOfPower;
        }

        public Slytherin(String fullName, int magic, int transgrestion, int cunning, int ambitious, int adroitness, int resoluteness, int lustOfPower) {

            if (cunning < 0 || cunning > 100) {
                throw new RuntimeException(" Invalid number cunning");
            }
            if (ambitious< 0 || ambitious > 100) {
                throw new RuntimeException(" Invalid number ambitious");
            }

            if (adroitness < 0 || adroitness > 100) {
                throw new RuntimeException(" Invalid number adroitness");
            }
            if (resoluteness < 0 || resoluteness > 100) {
                throw new RuntimeException(" Invalid number resoluteness");
            }
            if (lustOfPower < 0 || lustOfPower > 100) {
                throw new RuntimeException(" Invalid number lust of power");
            }
            this.cunning = cunning;
            this.ambitious = ambitious;
            this.adroitness = adroitness;
            this.resoluteness = resoluteness;
            this.lustOfPower = lustOfPower;
            this.transgrestion = transgrestion;
            this.magic = magic;
            this.fullName = fullName;
        }



    }


