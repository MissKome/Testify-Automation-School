import time
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from webdriver_manager.chrome import ChromeDriverManager


# Using any browser navigate to any YouTube video of your-choice, allow your script to wait for the comments to load
# then get the first two comments, and print them in the terminal.

def video_comment(driver, max_links=2):
    comment_elements = driver.find_elements(By.CSS_SELECTOR, "yt-formatted-string#content-text")
    for comment_element in comment_elements[:max_links]:
        print("Comments:", comment_element.text)


def main():
    driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
    driver.get("https://www.youtube.com/watch?v=FQ8vqCTgucA&t=13s")
    time.sleep(5)
    driver.execute_script("window.scrollTo(150, window.innerHeight);")
    time.sleep(10)
    video_comment(driver)


if __name__ == '__main__':
    main()
