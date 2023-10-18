import time
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from webdriver_manager.chrome import ChromeDriverManager


# Navigate to https://www.bbc.com/  and  print  out  thetop 10 latest news from the home page.
def bbclinks(driver, max_links=10):
    # get the latest news
    links = driver.find_elements(By.CSS_SELECTOR, "a[class=media__link]")
    # print out the first 10 news
    for link in links[:max_links]:
        print("Link:", link.text)


def main():
    driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
    driver.get("https://bbc.com")
    bbclinks(driver)


if __name__ == '__main__':
    main()


