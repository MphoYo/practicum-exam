# practicum-exam

ratshilingana mpho
st 10441904




purpose of weather app
weather forecasting- it provides users with accurate forecasts of current and future weather condition, including temperature,humidity,precipitation.this helps uses plan their activities accordingly
keep users to stay informed about sudden changes in weather patterns.also weather apps provide essential information to help usres stay safe during extreme weather events such as storm,snowstorms and thuenderstorms.
this app helps travelers plan their trips by providing weather forecasts for their destination cities.Farmers and agricultural businesses use weather apps to monitor weather condition that may affect crops.

Pseudocode

 start 
 //Difine weather class to hold weather data for a day 
 class weather(
    val day String,
    val temperature: Double
    val condition: string
    )
 // Difine weekweatherManager class to manage weekly weather
    class WeeklyWeatherManager {
       private val weeklyWeather : MutableList<Weather> = mutableListOf()

       // function to add weather data for a day
       fun addWeather(day : string< Temperature: Double, condition: string) {
       val weather = weather(day,temperature,condition)

      weeklyWeather.add(add(weather)

      }
      //function to update weather data for a pecific day
      fun deleteweather (day : string){
      weeklyWeather.removeIF { it .day ==day }
      }
    }

    end
  


