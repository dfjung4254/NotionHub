<template>
  <div class="container">
    <b-jumbotron bg-variant="white" text-variant="dark" border-variant="dark">

      <template #header>Notion Hub</template>
      <template #lead>
        Welcome, This is blog service.
      </template>
      <hr class="my-4">

      <p>
        Notion 작성만으로 손쉽게 기술블로그 포스팅을 도와주는 서비스
      </p>
    </b-jumbotron>

    <h2> 글을 등록해 주세요. </h2>

    <b-form @submit="callSample" @reset="">

      <b-form-group id="" label="" label-for="input_title">
        <b-form-input
          id="input_title"
          v-model="sample.title"
          placeholder="Enter title"
          required
        ></b-form-input>
      </b-form-group>

      <b-form-group id="" label="" label-for="input_content">
        <b-form-textarea
          id="input_content"
          v-model='sample.content'
          placeholder="Enter something..."
          rows="15"
          max-rows="15"
        ></b-form-textarea>
      </b-form-group>

      <b-button type="submit" variant="primary">Submit</b-button>
      <b-button type="reset" variant="danger">Reset</b-button>

    </b-form>

    <p v-if="$fetchState.pending">Fetching mountains...</p>
    <div v-else>

      <li v-for="sample in samples" :key="sample.id">

        <b-card :title='sample.title' >
          <b-card-text>
            {{sample.content}}
          </b-card-text>
        </b-card>
      </li>

    </div>

  </div>
</template>

<script>
export default {
  data() {
    const sample = {
      title: '',
      content: ''
    }

    return {
      sample,
      samples : []
    }
  },
  async fetch() {
    const result = await fetch(
      'http://localhost:8080/samples'
    ).then(res => res.json());
    console.log(result);
    this.samples = result
  },
  methods: {
    async callSample(event) {
      event.preventDefault()

      try{
        const result = await fetch(
          'http://localhost:8080/sample', {
            method: 'POST',
            body: JSON.stringify(this.sample),
            headers: {
              'Content-Type': 'Application/json'
            }
          }
        )
        const jsonResult = await result.json();
        location.reload();
      }catch(err) {
        //TODO: 적절한 에러 처리
        console.log(err);
      }

    },
    navigate(path) {
      this.$router.push(path);
    }
  }
}
</script>
