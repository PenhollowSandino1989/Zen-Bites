import java.util.ArrayList
import java.util.HashMap

// Initialize array list of healthy meal options 
val mealOptions = ArrayList<String>() 
mealOptions.add("Salad with grilled chicken") 
mealOptions.add("Quinoa and black beans") 
mealOptions.add("Brown rice with vegetables") 
mealOptions.add("Fish and steamed vegetables")

// Initialize hash map of meal sizes
val mealSizes = HashMap<String,String>() 
mealSizes.put("Small", "1 portion") 
mealSizes.put("Medium", "2 portions") 
mealSizes.put("Large", "4 portions")
  
// Create a HealthyMealDelivery class 
class HealthyMealDelivery { 
 
    private var order : String = "" 
  
    // Function to assemble a meal 
    fun assembleMeal(meal : String, size : String) { 
          
        // Set order with size 
        order = "Size: " + size + "\n"
  
        // Append order with meal 
        order += "Meal: " + meal 
    } 
  
    // Function to show order 
    fun showOrder() { 
        println("Your order is:") 
        println(order) 
    } 
} 

// Create an instance of HealthyMealDelivery
val delivery = HealthyMealDelivery()

// Iterate through mealOptions and mealSizes 
for (meal in mealOptions) {
   for ((key, value) in mealSizes) {
      // Assemble meal based on the current entries
      delivery.assembleMeal(meal, value)
   }
   // Show the current order
   delivery.showOrder()
   println()
}