FROM python:3.9

RUN apt-get update \
  && apt-get install -y --no-install-recommends \
  postgresql-client \
  && rm -rf /var/lib/apt/lists/*

WORKDIR /api2
COPY requirements.txt ./
RUN pip install -r requirements.txt
COPY . /api2/

EXPOSE 8000
CMD ["python", "manage.py", "runserver", "0.0.0.0:8000"] 