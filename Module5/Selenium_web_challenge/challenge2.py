import time
from selenium import webdriver
from selenium.webdriver import Keys
from selenium.webdriver.firefox.service import Service
from selenium.webdriver.common.by import By
from webdriver_manager.firefox import GeckoDriverManager


# Using    the    firefox    browser    navigate    tohttps://www.google.com/  enter  the  text  Python  in  thesearch  box,  then  send  the  Enter  key.  Get  the  text  from  theWikipedia  brief  on  the  right  side  and  print  the  value  in  theconsole
def google(driver):
    # enter the text python
    driver.find_element(By.XPATH, "//textarea[@id='APjFqb']").send_keys("Python", Keys.ENTER)
    time.sleep(5)
    # get the wikipedia brief on the right side
    googlesearch = driver.find_element(By.XPATH, "//span[contains(text(),'Python is a high-level, general-purpose programmin')]")
    # print the text
    print("Python search wikipedia: ", googlesearch.text)




def main():
    driver = webdriver.Firefox(service=Service(GeckoDriverManager().install()))
    driver.get("http://www.google.com")
    google(driver)


if __name__ == '__main__':
    main()
