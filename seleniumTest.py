# pip install selenium

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time

# Inicializar el driver (en este caso para Chrome)
driver = webdriver.Chrome()

try:
    # Abrir Google
    driver.get("https://www.google.com")
    
    # Encontrar el cuadro de búsqueda por el nombre del campo (q es el nombre del campo de búsqueda en Google)
    search_box = driver.find_element(By.NAME, "q")
    
    # Ingresar la consulta "weather in Paris"
    search_box.send_keys("weather in Paris")
    
    # Simular presionar Enter
    search_box.send_keys(Keys.RETURN)
    
    # Esperar unos segundos para que los resultados carguen
    time.sleep(3)
    
    # Verificar si aparece la información del clima (Google suele mostrar el clima en un bloque de datos)
    weather_info = driver.find_element(By.ID, "wob_tm")
    
    if weather_info:
        print("Prueba de aceptación exitosa: Se mostró el clima.")
    else:
        print("Prueba de aceptación fallida: No se mostró el clima.")

finally:
    # Cerrar el navegador
    driver.quit()
