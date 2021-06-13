<template>
  <div class="container text-light">
    <b-row class="mainLogoDiv">
      <b-img-lazy class="mainLogoImg" src="/logo_transparent.png" />
      <b-col>
        <b-row style="height:50%">
          <!-- 이미지 아이콘 영역 -->
        </b-row>
        <b-row style="height:50%; cursor: default">
          <!-- 텍스트 영역 -->
          Lorem ipsum dolor sit amet,
          consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
          Ut enim ad minim veniam,
          quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
          Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
          Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
        </b-row>
      </b-col>
    </b-row>
    <b-row>

    </b-row>
  </div>
</template>

<script>

export default {

}
</script>

<style>
.mainLogoDiv {
  height: 50vh;
}
.mainLogoImg {
  height: 100%;
  pointer-events: none;
}
</style>

