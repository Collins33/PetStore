 class PetStore{
     private String mName;
     private String mType;
     private String mColor;
      public String getName(){
          return mName;
      }
      public String getType(){
          return mType;
      }
      public String mColor(){
          return mColor;
      }
      public PetStore(String name,String type,String color){
          mName=name;
          mType=type;
          mColor=color;
      }
      public boolean animalIWant(String myPet){
          return (myPet.equals(mType));
      }        

 }