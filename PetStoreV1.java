import java.util.Scanner;

public class PetStoreV1 {


    static void FishBreed() {
        boolean inputValid = false;
        while (inputValid == false) {
            System.out.println("1. Angelfish \n2.TigerShark \n3.Koi \n4.Goldfish ");  
            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter Breed : ");
            int userBreed = userInput.nextInt();
            System.out.println();

            switch (userBreed) {
                case 1:
                    System.out.println("\t ItemId \t Product ID \t Description \t List Price ");
                    System.out.println("\t EST-1  \t FI-SW-01   \t Large Angelfish \t $16.50 ");
                    System.out.println("\t EST-2  \t FI-SW-01   \t Small Angelfish \t $16.50 ");
                    inputValid = true;
                    break;
                case 2:
                    System.out.println("\t ItemId \t Product ID \t Description \t List Price ");
                    System.out.println("\t EST-3  \t FI-SW-02   \t Toothless Tiger Shark \t $18.50 ");
                    inputValid = true;
                    break;
                case 3:
                    System.out.println("\t ItemId \t Product ID \t Description \t List Price ");
                    System.out.println("\t EST-4  \t FI-FW-01   \t Spotted Koi \t $18.50 ");
                    System.out.println("\t EST-5  \t FI-FW-01   \t Spotless Koi \t $18.50 ");
                    inputValid = true;
                    break;
                case 4:
                    System.out.println("\t ItemId \t Product ID \t Description \t List Price ");
                    System.out.println("\t EST-20  \t FI-FW-02   \t Adult Male Goldfish \t $5.50 ");
                    System.out.println("\t EST-21  \t FI-FW-02   \t Adult Female Goldfish \t $5.29 ");
                    inputValid = true;
                    break;
                default:
                    System.out.println("Pet Breed Not Found!");


            }
            System.out.println();
        }
    }

    static void DogBreed() {
        boolean inputValid = false;
        while (inputValid == false) {
            System.out.println("1. Bulldog \n2.Poodle \n3.Dalmation \n4.Golden Retriever \n5.Labrador Retriever \n6.Chihuahua ");  
            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter Breed : ");
            int userBreed = userInput.nextInt();
            System.out.println();

            switch (userBreed) {
                case 1:
                    System.out.println("Item ID        Product ID      Description                List Price");    
                    System.out.println("EST-6           K9-BD-01    Male Adult Bulldog             $18.50");
                    System.out.println("EST-7           K9-BD-01    Female puppy Bulldog           $18.50");
                    inputValid = true;
                    break;

                case 2:
                    System.out.println("Item ID        Product ID       Description                List Price");    
                    System.out.println("EST-8           K9-PO-02     Male puppy Poodle              $18.50");
                    inputValid = true;
                    break;

                case 3:
                    System.out.println("Item ID        Product ID      Description                           List Price");    
                    System.out.println("EST-9           K9-DL-01    Spotless Male Puppy Dalmation	      $18.50");
                    System.out.println("EST-10          K9-DL-01    Spotted Adult Female Dalmation            $18.50");
                    inputValid = true;
                    break;

                case 4:
                    System.out.println("Item ID        Product ID          Description                       List Price");    
                    System.out.println("EST-28          K9-RT-01      Adult Female Golden Retriver             $155.29");
                    inputValid = true;
                    break;

                case 5:
                    System.out.println("Item ID        Product ID          Description                       List Price");    
                    System.out.println("EST-22          K9-RT-02      Adult Male Labrador Retriver             $135.50");
                    System.out.println("EST-23          K9-RT-02      Adult Female Labrador Retriver             $145.50");
                    inputValid = true;
                    break;

                case 6:
                    System.out.println("Item ID        Product ID        Description                         List Price");    
                    System.out.println("EST-26          K9-CW-01      Adult Male Chihuahua	              $125.50");
                    System.out.println("EST-27          K9-CW-01      Adult Female Chihuahua                  $155.29");
                    inputValid = true;
                    break;

                default:
                    System.out.println("Pet Breed Not Found!");

            }
            System.out.println();
        }
    }

    static void RepBreed() {
        boolean inputValid = false;
        while (inputValid == false) {
            System.out.println("1. Rattlesnake \n2.Iguana");  
            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter Breed : ");
            int userBreed = userInput.nextInt();
            System.out.println();

            switch (userBreed) {
                case 1:
                    System.out.println("Item ID        Product ID          Description                       List Price");    
                    System.out.println("EST-11          RP-SN-01       Venomless Rattlesnake                   $18.50");
                    System.out.println("EST-12          RP-SN-01       Rattleless Rattlesnake                  $18.50");
                    inputValid = true;
                    break;

                case 2:
                    System.out.println("Item ID        Product ID          Description                       List Price");    
                    System.out.println("EST-13          RP-LI-02        Green Adult Iguana                     $18.50");
                    inputValid = true;
                    break;
                default:
                    System.out.println("Pet Breed Not Found!");


            }
            System.out.println();
        }

    }

    static void CatBreed() {
        boolean inputValid = false;
        while (inputValid == false) {
            System.out.println("1. Manx \n2.Persian");  
            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter Breed : ");
            int userBreed = userInput.nextInt();
            System.out.println();

            switch (userBreed) {
                case 1:
                    System.out.println("Item ID        Product ID          Description                       List Price");    
                    System.out.println("EST-14         FL-DSH-01         Tailless Manx                        $58.50");
                    System.out.println("EST-15         FL-DSH-01         With Tail Manx                       $23.50");
                    inputValid = true;
                    break;

                case 2:
                    System.out.println("Item ID        Product ID          Description                       List Price");    
                    System.out.println("EST-16         FL-DLH-02       Adult Male Persian                      $93.50");
                    System.out.println("EST-17         FL-DLH-02       Adult Female Persian                    $93.50");
                    inputValid = true;
                    break;
                default:
                    System.out.println("Pet Breed Not Found!");
            }
            System.out.println();
        }


    }

    static void BirdBreed() {

        boolean inputValid = false;
        while (inputValid == false) {
            System.out.println("1. Parrot \n2.Finch");  
            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter Breed : ");
            int userBreed = userInput.nextInt();
            System.out.println();

            switch (userBreed) {
                case 1:
                    System.out.println("Item ID        Product ID          Description                       List Price");    
                    System.out.println("EST-18          AV-CB-01       Adult Male Amazon Parrot               $193.50");
                    inputValid = true;
                    break;

                case 2:
                    System.out.println("Item ID        Product ID          Description                       List Price");    
                    System.out.println("EST-19          AV-SB-02         Adult Male Finch                     $15.50");
                    inputValid = true;
                    break;
                default:
                    System.out.println("Pet Breed Not Found!");
            }
            System.out.println();
        }



    }

    

    public static void main(String[] args) {
        
        boolean inputValid = false;

        while (inputValid == false) {
            
            System.out.println("1. Fish \n2.Dogs \n3.Reptiles \n4.Cats \n5.Birds");  
            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter Pet : ");
            int userPet = userInput.nextInt();
            System.out.println();

            switch (userPet) {
                case 1:
                    PetStoreV1.FishBreed();
                    inputValid = true;
                    break;
                case 2:
                    PetStoreV1.DogBreed();
                    inputValid = true;
                    break;
                case 3:
                    PetStoreV1.RepBreed();
                    inputValid = true;
                    break;
                case 4:
                    PetStoreV1.CatBreed();
                    inputValid = true;
                    break;
                case 5:
                    PetStoreV1.BirdBreed();
                    inputValid = true;
                    break;

                default:
                System.out.println("Pet not Found!");
            }
            System.out.println();

            
        }
        
    }

}
