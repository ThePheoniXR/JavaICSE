import os

readme_template = """# Java Programs for 9th ICSE

This GitHub repo contains all the programs taught in class.

NOTE: Some files may contain "package" at the top of the files; you don't have to copy that.

Message Madhav/Abhinav if you have any doubts regarding any programs or if you have found a mistake in the code.

<details>
<summary>

### (chapter_name)
</summary>

(chapters)

</details>
"""

default_url = "https://github.com/ThePheoniXR/JavaICSE/blob/loop/"

def extract_description(file_path):
    """Extract the description from the first line of the file."""
    with open(file_path, 'r') as f:
        first_line = f.readline().strip()
        if first_line.startswith("//") and first_line != "// null":
            return first_line.split("//")[1].strip()
    return "No description provided"

def generate_chapter_list(directory):
    """Generate a list of chapters and their descriptions."""
    chapters = []
    files = os.listdir(directory)
    
    for file in files:
        if file.endswith(".java"):
            improved_name = file.split(".")[0].capitalize()
            description = extract_description(os.path.join(directory, file))
            improved_name += f" - {description}"
            chapters.append(f"[{improved_name}]" + f"({default_url+directory.split(".")[1]+f"/{file}"})")

    
    return sorted(chapters) 

def create_readme():
    """Update README.md file with chapters."""
    directories = [d for d in next(os.walk('.'))[1] if d != '.git']

    for directory in directories:
        chapters = generate_chapter_list(os.path.join('.', directory))
        
        if chapters:
            chapters_list = "\n".join(f"- {chapter}" for chapter in chapters)
            chapter_section = readme_template.replace("(chapter_name)", directory).replace("(chapters)", chapters_list)
            
            with open("./README.md", "w") as readme:
                readme.write(chapter_section)

if __name__ == "__main__":
    create_readme()
